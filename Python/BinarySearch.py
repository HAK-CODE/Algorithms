def binarySearchSimple(input, key):
    """
    :param input: array of sorted numbers.
    :param key: number we want to search for.
    :return: number otherwise -1 if not found.
    """
    low = 0
    high = len(input)- 1

    while low <= high:
        mid = low + (high - low)
        if key < input[mid]: high = mid - 1
        elif key > input[mid]: low = mid + 1
        else: return mid
    return -1

inp = range(1,10000000)
print(binarySearchSimple(inp, 4))