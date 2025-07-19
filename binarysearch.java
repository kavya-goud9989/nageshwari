def binary_search(arr, target):
    low = 0
    high = len(arr) - 1

    while low <= high:
        mid = (low + high) // 2  # Find the middle index
        guess = arr[mid]

        if guess == target:
            return mid  # Target found
        elif guess < target:
            low = mid + 1  # Target is on the right half
        else:
            high = mid - 1  # Target is on the left half

    return -1  # Target not found

# Example usage
numbers = [1, 3, 5, 7, 9, 11, 13]
target_value = 7

result = binary_search(numbers, target_value)

if result != -1:
    print(f"Target {target_value} found at index {result}.")
else:
    print(f"Target {target_value} not found in the list.")
