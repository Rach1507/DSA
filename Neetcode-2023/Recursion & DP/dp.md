Alvins Memo Recipe

1.Make it work
Visualise the problem in graph -

    Expectation
    faith

    Generalise
    Base case - leaves of the nod

2.Make it effecient

    Add memo object -
        keys - agruments to the function
        values - return values of those functions


    Add another base case
        Retain old base cases
        +  If my arguments are in memo as a key - return that memo[key]


    Store the return obj - into memo , return
        Go to the exxact position where u are returning
        Store the return value in memo - before returning
        Return memo
