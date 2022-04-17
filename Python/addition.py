def addition(a, b):
	return a + b


if __name__ == '__main__':
    a = int(raw_input())
    b = int(raw_input())

    print(a // b)
    print(a / b)

def square_range(n):
    for i in range(0, n):
        print(i ** 2)