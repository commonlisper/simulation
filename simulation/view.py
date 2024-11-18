from abc import ABC, abstractmethod

from field import Field


class Renderer(ABC):
    def __init__(self, field: Field) -> None:
        self.field = field

    @abstractmethod
    def render(self): ...


class ConsoleRenderer(Renderer):
    def __init__(self, field) -> None:
        super().__init__(field)

    def render(self):
        print(self.field)


def request_field_dimensions() -> tuple[int, int]:
    width = process_width()
    height = process_height()

    return width, height


def process_width() -> int:
    while True:
        width_as_str = get_user_input("Enter field width")

        if is_valid_int(width_as_str):
            return int(width_as_str)

        print("You entered non-int value, try again")


def process_height() -> int:
    while True:
        height_as_str = get_user_input("Enter field height")

        if is_valid_int(height_as_str):
            return int(height_as_str)

        print("You entered non-int value, try again")


def get_user_input(message: str) -> str:
    return input(f"{message}: ")


def is_valid_int(value: str) -> bool:
    return value.isdigit()
