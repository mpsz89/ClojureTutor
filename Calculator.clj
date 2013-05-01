(ns Kalkulator)
(defn sum [a b]
  (println (+ a b)))

(defn adj [a b]
  (println (adj (- a b))))

(defn mult [a b]
  (println (* a b)))

(defn div [a b]    
  (println (/ a b)))

(defn modulo [a b]
  (println (mod a b)))
