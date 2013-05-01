(ns factorial)
(defn fact [n]
  (loop [n n acc 1]
    (if (= n 0)
      acc
      (recur (dec n) (* n acc)))))
