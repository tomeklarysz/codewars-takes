def high_and_low(numbers):
    print(numbers)
    some_list = numbers.split()
    some_list = list(map(int, some_list))
    some_list.sort()
    highest = some_list[-1]
    lowest = some_list[0]
    return f"{highest} {lowest}"