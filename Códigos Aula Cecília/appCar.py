from car import Car

car1 = Pessoa('Cerato', 'Kia', 2020, 102.990)
car2 = Pessoa('Cerato', 'Kia', 2020, 87.850)
car3 = Pessoa('Soul', 'Kia', 2020, 79.990)
car4 = Car('Soul', 'Kia', 2020, 50.000)
car5 = Car('Voyage', 'Volkswagen', 2020, 59.750)


print('Carros disponíveis para locação:\n')

car1.ShowCar()
car1.Km0()
print('\n')

car2.ShowCar()
car2.SemiNew()
print('\n')

car3.ShowCar()
car3.Km0()
print('\n')

car4.ShowCar()
car4.Used()
print('\n')

car5.ShowCar()
car5.Km0()

