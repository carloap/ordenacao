<?php 

/**
 * Classe de ordenação
 */
class Ordena
{

    /**
     * Ordena um array utilizando o bom e velho bubbleSort
     */
    public function bubbleSort(array $array)
    {
        for($k=0, $k_s=count($array); $k<$k_s ; $k++)
        {
            for($y=$k+1; $y<$k_s; $y++)
            {
                if($array[k]>$array[y])
                {
                    $aux = $array[$k];
                    $array[$k] = $array[$y];
                    $array[$y] = $aux;
                }
            }
        }
        return $array;
    }

}

// Array de teste com números aleatórios
$array_teste = array('5','4','7','1','3','8','0','6','2','9');

$ordena = new Ordena();

$array_ordenada = $ordena->bubbleSort($array_teste);