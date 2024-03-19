import time
from Prim import prim 
import Helper as h

filename = "graph32.txt"
m = h.triangularMatrixFromFile(filename)

start_time = time.time()
selectedNodes = prim(m)[0]
cost = prim(m)[1]
end_time = time.time()

execution_time = end_time - start_time
print("Execution time:", execution_time, "seconds")
print("Cost:", cost)