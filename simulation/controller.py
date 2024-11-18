from actions import Action


class Simulation:
    def __init__(self, field, renderer) -> None:
        self.field = field
        self.renderer = renderer
        self.actions: list[Action] = []

    def start_simulation(self) -> None:
        print("simulation runs!!!")

    def pause_simulation(self) -> None:
        print("simulation pauses!!!")
