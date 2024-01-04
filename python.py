def fibonacci(n):
    fib_sequence = [0, 1]
    while len(fib_sequence) < n:
        fib_sequence.append(fib_sequence[-1] + fib_sequence[-2])
    return fib_sequence

def is_prime(num):
    if num < 2:
        return False
    for i in range(2, int(num**0.5) + 1):
        if num % i == 0:
            return False
    return True

def sum_of_primes_in_range(start, end):
    prime_sum = 0
    for num in range(start, end + 1):
        if is_prime(num):
            prime_sum += num
    return prime_sum

if __name__ == "__main__":
    # Generate and print the first 15 Fibonacci numbers
    n = 15
    fib_result = fibonacci(n)
    print(f"Fibonacci Sequence (first {n} numbers): {fib_result}")

    # Calculate and print the sum of prime numbers in the range of 1 to 50
    start_range = 1
    end_range = 50
    prime_sum_result = sum_of_primes_in_range(start_range, end_range)
    print(f"Sum of Prime Numbers in the range ({start_range}-{end_range}): {prime_sum_result}")
