class Field:
    def __init__(self, width: int, height: int) -> None:
        self.objects = [[" " for y in range(width)] for x in range(height)]
