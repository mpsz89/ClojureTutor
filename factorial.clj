(ns factorial)
(defn fact [x]
  (if (= x 0)
    1
    (* x (fact (- x 1)))))
