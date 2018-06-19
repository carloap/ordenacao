/**
 * Ordenar array utilizando bubbleSort simples
 */
function bubbleSort(arr)
{
    for(a=0,a_s=arr.length; a<a_s; a++)
    {
        for(b=a+1; b<a_s; b++)
        {
            var aux=arr[a];
            arr[a]=arr[b];
            arr[b]=aux;
        }
    }
    return arr;
}
