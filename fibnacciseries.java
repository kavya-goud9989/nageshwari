def fibonacci(n):
    fib_series = [0, 1]
    while len(fib_series) < n:
        next_value = fib_series[-1] + fib_series[-2]
        fib_series.append(next_value)
    return fib_series[:n]

# Example usage
n = 10
print(f"Fibonacci series up to {n} terms: {fibonacci(n)}")
