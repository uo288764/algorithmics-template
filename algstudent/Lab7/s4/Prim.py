import Helper as h

def printMatrix(matrix):
    for row in matrix:
        for element in row:
            print(element, end="\t")
        print()  
        
def Prim(node, m):
    rows = len(m)
    cols = len(m[0])
    arist = m[node - 1][node - 1]
    
    values = [0] * rows  
    
    for j in range(node-1, cols):
        minVal = 1000  
        if node - 1 != j:
            costA = arist + m[node-1][j]
            costB = arist + m[j][node-1]
            
            if costA < costB and costA < minVal:
                minVal = costA
                m[j][node-1] = costA
            elif costB < costA and costB < minVal:
                minVal = costB
                m[node-1][j] = costB
                
            values[j] = minVal
                
  
    return values


filename = "graph4.txt"
m = h.triangularMatrixFromFile(filename)

printMatrix(m)
print('\n')

print(Prim(1, m))

