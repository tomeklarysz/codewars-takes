def invert(lst):
    new_list = []
    for index in range(len(lst)):
        if lst[index] > 0:
            new_list[index] = -abs(lst[index])
        elif lst[index] < 0:
            new_list[index] = abs(lst[index])
        else:
            new_list[index] = lst[index]
    return new_list

invert([1, -2, 3, -4])