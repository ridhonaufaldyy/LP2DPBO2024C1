from Clothing import Clothing

class Shirt(Clothing):
    def __init__(self, idProduct, name, brand, price, size, material, gender, color, sleeveType):
        super().__init__(idProduct, name, brand, price, size, material, gender)
        self.color = color
        self.sleeveType = sleeveType
