(ns Subfact)
(defn fact
  [n]
  (if(= n 0)
        1
        (* n (fact(- n 1)))))

(defn subfact
  [n]  
  (int (/ (fact n) 2.719)))
