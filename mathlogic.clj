(ns mathlogic)
(defn alt [p q]
  (if (and (= p 1) (= q 1))
           true
    (if (and (= p 1) (= q 0))
           true
      (if (and (= p 0) (= q 1))
           true
        (if (and (= p 0) (= q 0))
            false 
             "logical value error")))))

(defn con [p q]
  (if (and (= p 1) (= q 1))
           true
    (if (and (= p 1) (= q 0))
           false
      (if (and (= p 0) (= q 1))
           false
        (if (and (= p 0) (= q 0))
            false 
             "logical value error")))))

(defn imp [p q]
  (if (and (= p 1) (= q 1))
           true
    (if (and (= p 1) (= q 0))
           false
      (if (and (= p 0) (= q 1))
           true
        (if (and (= p 0) (= q 0))
            true 
             "logical value error")))))

(defn iff [p q]
  (if (and (= p 1) (= q 1))
           true
    (if (and (= p 1) (= q 0))
           false
      (if (and (= p 0) (= q 1))
           false
        (if (and (= p 0) (= q 0))
            true 
             "logical value error")))))

(defn nand [p q]
  (if (and (= p 1) (= q 1))
           false
    (if (and (= p 1) (= q 0))
           true
      (if (and (= p 0) (= q 1))
           true
        (if (and (= p 0) (= q 0))
            true 
             "logical value error")))))

(defn xor [p q]
  (if (and (= p 1) (= q 1))
           false
    (if (and (= p 1) (= q 0))
           true
      (if (and (= p 0) (= q 1))
           true
        (if (and (= p 0) (= q 0))
            false 
             "logical value error")))))

(defn nor [p q]
  (if (and (= p 1) (= q 1))
           false
    (if (and (= p 1) (= q 0))
           false
      (if (and (= p 0) (= q 1))
           false
        (if (and (= p 0) (= q 0))
            true 
             "logical value error")))))

(defn xnor [p q]
  (if (and (= p 1) (= q 1))
           true
    (if (and (= p 1) (= q 0))
           false
      (if (and (= p 0) (= q 1))
           false
        (if (and (= p 0) (= q 0))
            true 
             "logical value error")))))
