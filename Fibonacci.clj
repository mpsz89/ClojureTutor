;Michał Piotr Szmigiel
;Clojure 1.6.0
;16 listopada 2014 r.
;Liczby Fibonacci w Clojure

;Funkcja ciągu Fibonacciego
(defn fib
  [n]
  (if(= n 0) 0
    (if(= n 1) 1 (+ (fib (- n 1)) (fib (- n 2))))))

;Funkcja macierzy Fibonacciego
(defn matrix_fib
  [n]
  (println (format "[ %s, %s, %s, %s ]" (fib (+ n 3)) (fib (+ n 2))
                   (fib (+ n 2)) (fib (+ n 1)))))
                   
;Funkcja złotego podziału Fibonacciego
(defn gold_fib
  [n]
  (float (/ (fib (+ n 1)) (fib n))))
