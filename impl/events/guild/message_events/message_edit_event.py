from dispy.impl.events.event import BaseEvent
from dispy.data.guild.messages.message import Message


class MessageEditEvent(BaseEvent):
    API_EVENT_NAME: str = "MESSAGE_UPDATE"

    previous_message: Message
    current_message: Message

    def process_event(self, cache_manager, **kwargs):
        self.current_message = Message(**kwargs)
        message = cache_manager.get_message(int(kwargs.get("id")))
        if message is None:
            return

        self.previous_message = message
