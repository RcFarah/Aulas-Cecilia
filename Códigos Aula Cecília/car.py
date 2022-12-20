class Car:


    def __init__(self, model, brand, year, price):
        self.price = price
        self.year = year
        self.brand = brand
        self.model = model


    def Km0(self):
        print('Rodagem: 0 km!')

    def SemiNew(self):
        print('Rodagem: 1 - 999Km!')

    def Used(self):
        print('Rodagem: >1000Km!')

    def ShowCar(self):
        print('Carro: \n- {}\n- {}\n- {}\n- {}'.format(self.model, self.brand, self.year, self.price))
