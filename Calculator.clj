(ns Kalkulator)
(defn sum [a b]
  (println (+ a b)))

(defn adj [a b]
  (println (- a b)))

(defn mult [a b]
  (println (* a b)))


(defn div [a b]
  (if (and (> a 0) (= b 0))
    "wrong calculating value !!!"  
    (if (and (= a 0) (> b 0))
      0   
  (println (/ a b)))))

(defn modulo [a b]
  (if (and (> a 0) (= b 0))
    "wrong calculating value !!!"
    (if (and (> a 0) (= b 0))
      0
  (println (mod a b)))))
