(ns ComplexFunction)
(defn re
  [x y]
  (- (* x x) (* y y)))

(defn im
  [x y]
  (* 2 (* x y)))

(defn complex
  [re im]
  (if(and (= re 0) (>= im 0))
          (str im"j")
          (if(and (= re 0) (< im 0))
                    (str im"j")
                    (if(and (< re 0) (< im 0))
                              (str "("re""im"j)")
                            (if(and (> re 0) (< im 0))
                                    (str "("re""im"j)")
                                    (str "("re"+"im"j)"))))))

(defn complex_function
  [x y]
  (complex (re x y) (im x y)))
