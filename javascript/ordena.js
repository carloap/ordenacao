/**
 * Ordenar array utilizando bubbleSort simples
 */
function bubbleSort(arr)
{
    for(a=0,a_s=arr.length; a<a_s; a++)
    {
        for(b=a+1; b<a_s; b++)
        {
            if(arr[a]>arr[b])
            {
                var aux=arr[a];
                arr[a]=arr[b];
                arr[b]=aux;
            }
        }
    }
    return arr;
}

var array_teste = ['5','0','6','9','1','3','4','7','8','2'];
bubbleSort(array_teste);