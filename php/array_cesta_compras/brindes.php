<?php 


// ESCOPO...
class Brinde
{

    // Simulando base de produtos
    private $array_return_db_produtos = array(
        '100' => array(
            'id' => '100',
            'nome' => 'produto 100',
            'preco' => 29.99
        ),
        '111' => array(
            'id' => '111',
            'nome' => 'produto 111',
            'preco' => 18.99
        ),
        '222' => array(
            'id' => '222',
            'nome' => 'produto 222',
            'preco' => 14.25
        ),
        '333' => array(
            'id' => '333',
            'nome' => 'produto 333',
            'preco' => 15.40
        ),
        '444' => array(
            'id' => '444',
            'nome' => 'produto 444',
            'preco' => 11.20
        ),
        '555' => array(
            'id' => '555',
            'nome' => 'produto 555',
            'preco' => 6.03
        ),
        '664' => array(
            'id' => '664',
            'nome' => 'brinde produto 664',
            'preco' => 0.01
        ),
        '665' => array(
            'id' => '665',
            'nome' => 'brinde produto 665',
            'preco' => 0.01
        ),
        '666' => array(
            'id' => '666',
            'nome' => 'brinde produto 666',
            'preco' => 0.01
        ),
        '667' => array(
            'id' => '667',
            'nome' => 'brinde produto 667',
            'preco' => 0.01
        ),
        '777' => array(
            'id' => '777',
            'nome' => 'produto faixa 1 777',
            'preco' => 4.20
        ),
        '888' => array(
            'id' => '888',
            'nome' => 'produto faixa 1 888',
            'preco' => 19.80
        ),
        '999' => array(
            'id' => '999',
            'nome' => 'produto faixa 1 999',
            'preco' => 7.30
        ),
        '1000' => array(
            'id' => '1000',
            'nome' => 'produto faixa 1 1000',
            'preco' => 4.10
        )
    );


    // Simulando a cesta
    private $array_produtos_cesta = array(
        '111' => array(
            'id' => '111',
            'nome' => 'produto 111',
            'preco' => 18.99,
            'quantidade' => 1
        ),
        '222' => array(
            'id' => '222',
            'nome' => 'produto 222',
            'preco' => 14.25,
            'quantidade' => 1
        ),
        '333' => array(
            'id' => '333',
            'nome' => 'produto 333',
            'preco' => 15.40,
            'quantidade' => 2
        ),
        '444' => array(
            'id' => '444',
            'nome' => 'produto 444',
            'preco' => 11.20,
            'quantidade' => 3
        ),
        '555' => array(
            'id' => '555',
            'nome' => 'produto 555',
            'preco' => 6.03,
            'quantidade' => 3
        )
    );


    function __construct() 
    {

    }

    function aplica_brinde($array_brinde, $array_criterio, $array_criterio2 = NULL, $is_brinde_por_produto = FALSE)
    {
        $keys_cesta = array_keys($this->array_produtos_cesta);
        $check_cesta = array_intersect($array_criterio, $keys_cesta);
        $qde_criterio = count($array_criterio);
        $qde_check_cesta = count($check_cesta);

        echo "<pre>";
        var_dump($this->array_produtos_cesta);
        echo "</pre>";

        // Verifica se o critério está ok
        if(isset($check_cesta) && $qde_check_cesta>0 && $qde_check_cesta == $qde_criterio)
        {
            // Iterar os brindes...
            foreach($array_brinde as $brinde_val)
            {
                // Antes de inserir, verifica se o brinde já não existe na cesta
                if(in_array($brinde_val, $keys_cesta) )
                {
                    echo "sim, já existe!<br>";
                    // remove para aplicar calculo do preço... 
                    // TODO
                }
                else 
                {
                    echo "não existe<br>";

                    // Insere o brinde
                    $this->array_produtos_cesta[$brinde_val] = array(
                        'id' => $brinde_val,
                        'nome' => 'teste2',
                        'preco' => '0.01',
                        'quantidade' => 1
                    );
                    
                    // Desconta o valor em um dos itens critérios
                    $aux = $this->array_produtos_cesta[$array_criterio[0]]['preco'];
                    $this->array_produtos_cesta[$array_criterio[0]]['preco'] = (float) $aux - 0.01;

                }
                echo "<br>";
            }
        }
        
        echo "================================================================== resultado final<br>";

        echo "<pre>";
        var_dump($this->array_produtos_cesta);
        echo "</pre>";

    }

}

// Simulando o critério para os brindes
$array_brinde = array('666');
$array_criterio = array('222','333', '444');
$array_criterio2 = NULL;
$is_brinde_por_produto = FALSE; // determina se o brinde se aplica por produto (true) ou por pedido (false)

echo "teste de manipulação de brindes em cesta de pedidos";
echo "<br/>";

$brinde = new Brinde();
$brinde->aplica_brinde($array_brinde, $array_criterio, $array_criterio2, $is_brinde_por_produto);