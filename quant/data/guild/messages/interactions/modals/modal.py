from typing import List

import attrs

from quant.data.components.component import Component
from quant.data.components.action_row import ActionRow
from quant.data.guild.messages.interactions.modals.text_input_style import TextInputStyle


@attrs.define(kw_only=True)
class Modal:
    title: str = attrs.field(default="Modal")
    custom_id: str = attrs.field()
    components: List[ActionRow] = attrs.field()


@attrs.define(kw_only=True)
class TextInput(Component):
    custom_id: str = attrs.field()
    style: TextInputStyle = attrs.field(default=TextInputStyle.SHORT)
    label: str = attrs.field()
    min_length: int = attrs.field(default=0)
    max_length: int = attrs.field(default=4000)
    required: bool = attrs.field(default=True)
    value: str = attrs.field(default=None)
    placeholder: str = attrs.field(default=None)
    _type: int = attrs.field(default=4, repr=False, alias="type")

    def as_json(self):
        return {
            'type': self._type,
            'custom_id': self.custom_id,
            'style': self.style.value,
            'label': self.label,
            'min_length': self.min_length,
            'max_length': self.max_length,
            'required': self.required,
            'value': self.value,
            'placeholder': self.placeholder
        }
