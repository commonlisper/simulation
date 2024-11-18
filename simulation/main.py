from field import Field
from view import ConsoleRenderer, request_field_dimensions
from controller import Simulation


def main() -> None:
    width, height = request_field_dimensions()
    field = Field(width, height)
    renderer = ConsoleRenderer(field)
    simulation = Simulation(field, renderer)
    simulation.start_simulation()


if __name__ == "__main__":
    main()
