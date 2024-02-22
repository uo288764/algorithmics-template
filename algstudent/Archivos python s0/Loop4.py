import time

def loop4(n):
    cont = 0
    for i in range(1, n + 1):
        for j in range(1, i + 1):
            for k in range(1, j + 1):
                cont += 1
    return cont

if __name__ == "__main__":
    nTimes = 10
    print("Loop 4")
    print("n\ttime\trepetitions\tcounter")

    n = 100
    while n <= 819200:
        t1 = time.time()
        c = 0
        for repetitions in range(1, nTimes + 1):
            c = loop4(n)
        t2 = time.time()
        print(f"{n}\t{(t2 - t1) * 1000:.0f}\t{nTimes}\t\t{c}")
        n *= 2
