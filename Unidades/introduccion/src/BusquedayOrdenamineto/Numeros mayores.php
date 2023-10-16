<?php
$numeros = array(12, 8, 18, 2, 9, 6, 16, 21);

function buscarNumerosmayores($array, $valorMinimo) {
    $resultados = array();
    foreach ($array as $numero) {
        if ($numero > $valorMinimo) {
            $resultados[] = $numero;
        }
    }
    return $resultados;
}

function ordenarNumerosdescendente($array) {
    arsort($array);
    return $array;
}
$valorMinimo = 4;
$resultados = buscarNumerosMayores($numeros, $valorMinimo);
$numerosOrdenados = ordenarNumerosdescendente($resultados);

echo "Los números mayores que $valorMinimo, son:\n";
foreach ($numerosOrdenados as $numero) {
    echo $numero . "\n";
}
?>
