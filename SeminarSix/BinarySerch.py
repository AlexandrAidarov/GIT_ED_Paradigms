def binary_search(list, search):
    first = 0
    last = len(list) - 1
    middle = (first + last) // 2

    while list[middle] != search:
        if first > last:
            return f"{search} not found"
        if search < list[middle]:
            last = middle - 1
        else:
            first = middle + 1
        middle = (first + last) // 2

    return f'{search} found at position {middle}'

list = [1, 4, 7, 10, 14, 19, 102, 2575, 10000]

for i in list:
    search = i
    print(f'Binary search: {binary_search(list, search)}')