import random

def generateEchelonMatrix(num_rows, filename):
    with open(filename, 'w') as file:
        for i in range(num_rows, 0, -1):
            line = ','.join(str(random.randint(100, 999)) for _ in range(i))
            file.write(line + '\n')


num_rows = 4096
filename = 'graph4096.txt'
generateEchelonMatrix(num_rows, filename)
print(f"File '{filename}' created with a square matrix of size {num_rows}x{num_rows}.")