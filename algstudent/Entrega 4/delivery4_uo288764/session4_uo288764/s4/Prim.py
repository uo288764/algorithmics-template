import Helper as h

def printMatrix(matrix):
    for row in matrix:
        for element in row:
            print(element, end="\t")
        print()  
        
def findMinValue(m,selected_nodes):
    minValue = float('inf')
    index = -1
    
    for fromNode in selected_nodes:
        for toNode in range(len(m[fromNode])):
            mValue = m[fromNode][toNode]
            
            if(mValue < minValue and toNode not in selected_nodes and mValue != 0):
                minValue = mValue
                index = toNode
                
            mValue = m[toNode][fromNode]
            if(mValue < minValue and toNode not in selected_nodes and mValue != 0):
                minValue = mValue
                index = toNode

    selected_nodes.append(index)
    
    return minValue
       
def prim(m):
    selected_nodes=[]
    cost = []
    cost.append(0)
    selected_nodes.append(0)
    numNodes=len(m)
    
    while( len(selected_nodes) < numNodes ):
        minValue = findMinValue(m,selected_nodes)
        cost.append(minValue)
        
    return selected_nodes, cost

def printPrimResults(selected_nodes,cost):
    print("COSTE TOTAL ÓPTIMO =", sum(cost))
    print("********************")
    print("ARISTAS SELECCIONADAS=")
    for i in range(1, len(selected_nodes)):
        print(f"ARISTA NUMERO {i}: DESDE NODO={i-1} HASTA NODO {i} *** COSTE={cost[i]}")

'''
filename = "graph8.txt"
m = h.triangularMatrixFromFile(filename)

#printMatrix(m)

selected_nodes = prim(m)[0]
cost = prim(m)[1]

printPrimResults(selected_nodes,cost)

'''