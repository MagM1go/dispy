import datetime
from typing import List, Any

import attrs

from quant.data.guild.voice.voice_state_update import VoiceState
from quant.data.model import BaseModel
from quant.data.gateway.snowflake import Snowflake
from quant.data.guild.members.member import GuildMember
from quant.utils.attrs_extensions import execute_converters, int_converter


@attrs.define(field_transformer=execute_converters)
class Guild(BaseModel):
    guild_id: Snowflake = attrs.field(alias="id", converter=int_converter)
    name: str = attrs.field(default=None)
    owner_id: Snowflake = attrs.field(converter=int_converter, default=0)
    verification_level: int = attrs.field(converter=int_converter, default=0)
    explicit_content_filter: int = attrs.field(converter=int_converter, default=0)
    default_message_notifications: int = attrs.field(converter=int_converter, default=0)
    mfa_level: int = attrs.field(converter=int_converter, default=0)
    threads: List[Any] = attrs.field(default=[])
    stage_instances: List[Any] = attrs.field(default=[])
    embedded_activities: List[Any] = attrs.field(default=[])
    unavailable: bool = attrs.field(default=False)
    channels: List[Any] = attrs.field(default=[])
    guild_scheduled_events: List[Any] = attrs.field(default=[])
    guild_hashes: List[Any] = attrs.field(default=[])
    lazy: bool = attrs.field(default=False)
    application_command_counts: int = attrs.field(default=0)
    joined_at: datetime.datetime = attrs.field(default=None)
    member_count: int = attrs.field(default=0, converter=int_converter)
    presences: List[Any] = attrs.field(default=[])
    members: List[GuildMember] = attrs.field(default=[], converter=GuildMember.as_dict_iter)
    large: bool = attrs.field(default=False)
    permissions: str = attrs.field(default=None)
    roles: List[Any] = attrs.field(default=[])
    emojis: List[Any] = attrs.field(default=[])
    icon: str = attrs.field(default=None)
    icon_hash: str = attrs.field(default=None)
    splash: str = attrs.field(default=None)
    discovery_slash: str = attrs.field(default=None)
    owner: bool = attrs.field(default=False)
    region: str = attrs.field(default=None)
    afk_channel_id: int = attrs.field(default=0)
    afk_timeout: int = attrs.field(default=0, converter=int_converter)
    widget_enabled: bool = attrs.field(default=False)
    widget_channel_id: int = attrs.field(default=0)
    features: List[Any] = attrs.field(default=[])
    application_id: int = attrs.field(default=0)
    system_channel_id: int = attrs.field(default=0, converter=int_converter)
    system_channel_flags: int = attrs.field(default=0, converter=int_converter)
    rules_channel_id: int = attrs.field(default=0)
    max_presences: int = attrs.field(default=None)
    max_members: int = attrs.field(default=0, converter=int_converter)
    vanity_url_code: str = attrs.field(default=None)
    description: str = attrs.field(default=None)
    banner: str = attrs.field(default=None)
    premium_tier: int = attrs.field(default=0, converter=int_converter)
    premium_subscription_count: int = attrs.field(default=0, converter=int_converter)
    preferred_locale: str = attrs.field(default=None)
    public_updates_channel_id: int = attrs.field(default=0)
    max_video_channel_users: int = attrs.field(default=0, converter=int_converter)
    max_stage_video_channel_users: int = attrs.field(default=0, converter=int_converter)
    approximate_member_count: int = attrs.field(default=0, converter=int_converter)
    approximate_presence_count: int = attrs.field(default=0, converter=int_converter)
    welcome_screen: Any = attrs.field(default=None)
    nsfw_level: int = attrs.field(default=0, converter=int_converter)
    stickers: List[Any] = attrs.field(default=[])
    premium_progress_bar_enabled: bool = attrs.field(default=False)
    safety_alerts_channel_id: int = attrs.field(default=0)
    voice_states: List[VoiceState] = attrs.field(default=None, converter=VoiceState.as_dict_iter)
    home_header: str = attrs.field(default=None)
    discovery_splash: str = attrs.field(default=None)
    hub_type: int = attrs.field(default=0)
    latest_onboarding_question_id: int = attrs.field(default=0)
    nsfw: bool = attrs.field(default=False)
    incidents_data: str = attrs.field(default=None)
    embed_enabled: bool = attrs.field(default=False)
    embed_channel_id: int = attrs.field(default=0, converter=int_converter)
    inventory_settings: Any = attrs.field(default=None)
    soundboard_sounds: List[Any] = attrs.field(default=None)
    version: int = attrs.field(default=0, converter=int_converter)
    locale: str = attrs.field(default=None)

    async def delete(self) -> None:
        await self.client.rest.delete_guild(self.guild_id)

    def get_member(self, member_id: Snowflake | int) -> GuildMember:
        return [i for i in self.members if i.user.user_id == member_id][0]
