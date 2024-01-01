from typing import List
from datetime import datetime

import attrs

from quant.entities.snowflake import Snowflake


def iso_to_datetime(time: str = None):
    if time is None:
        return

    return datetime.fromisoformat(time)


def int_converter(data: str = None) -> int | Snowflake:
    check = isinstance(data, (str, bytes, int))
    if data is None or not check:
        return 0

    if check:
        return Snowflake(int(data))

    return int(data)


def to_snowflake(data: str = None) -> int | Snowflake:
    return Snowflake(int(data))


def execute_converters(_, fields: List[attrs.Attribute]):
    converters = {
        datetime: iso_to_datetime,
        'datetime': iso_to_datetime,
        int: int_converter,
        'int': int_converter,
        Snowflake: int_converter,
        'Snowflake': int_converter
    }

    return [
        field if field.converter is not None else field.evolve(
            converter=converters.get(field.type)
        ) for field in fields
    ]
