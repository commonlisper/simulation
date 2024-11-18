from abc import ABC, abstractmethod
from random import choice


class Entity(ABC):
    pass


class Grass(Entity):
    def __repr__(self) -> str:
        return "🥦"


class Rock(Entity):
    def __repr__(self) -> str:
        return "⛰️"


class Tree(Entity):
    def __init__(self):
        trees = ["🌲", "🌳", "🌴"]
        self.pic = choice(trees)

    def __repr__(self) -> str:
        return self.pic


class Creature(Entity, ABC):
    def __init__(self, hp: int, speed: int) -> None:
        super().__init__()
        self.hp = hp
        self.speed = speed

    @abstractmethod
    def make_move(self) -> None: ...


class Herbivore(Creature):
    def __init__(self, hp: int, speed: int) -> None:
        super().__init__(hp, speed)

    def make_move(self) -> None:
        pass

    def __repr__(self) -> str:
        return "🐇"


class Predator(Creature):
    def __init__(self, hp: int, speed: int, attack: int) -> None:
        super().__init__(hp, speed)
        self.attack = attack

    def make_move(self) -> None:
        pass


class Wolf(Predator):
    def __repr__(self) -> str:
        return "🐺"


class Fox(Predator):
    def __repr__(self) -> str:
        return "🦊"
