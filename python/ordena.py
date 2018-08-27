# -*- coding: utf-8 -*-

# função bubblesort: algoritmo de ordenação simples 
def bubblesort(lista):
    for a in range(len(lista)-1,0,-1):
        for b in range(a):
            if lista[b] > lista[b+1]:
                aux = lista[b]
                lista[b] = lista[b+1]
                lista[b+1] = aux

# inicializar
lista = ['5','0','6','9','1','3','4','7','8','2']
bubblesort(lista)
print(lista)