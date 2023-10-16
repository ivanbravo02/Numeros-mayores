<?php
function fibonacci($n) {
    if ($n <= 0) {
        return 0;
    } elseif ($n == 1) {
        return 1;
    } else {
        return fibonacci($n - 1) + fibonacci($n - 2);
    }
}

// Ejemplo de uso:
$numero = 10;
$resultado = fibonacci($numero);
echo "El término $numero en la serie de Fibonacci es $resultado";


?>


