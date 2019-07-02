package algorithms

object SieveOfEratosthenes {

    /**
     * O(sqrt(n)loglog(n))
     */
    @JvmStatic
    fun resolve(n: Int) : Array<Int> {
        // Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.
        val prime = BooleanArray(n + 1)
        for (i in 0 until n) {
            prime[i] = true
        }

        var p = 2
        while (p * p <= n) {
            // If prime[p] is not changed, then it is a prime
            if (prime[p] == true) {
                // Update all multiples of p
                var i = p * 2
                while (i <= n) {
                    prime[i] = false
                    i += p
                }
            }
            p++
        }

        // Print all prime numbers
        return (2..n)
                .filter { prime[it] == true }
                .toTypedArray()
    }
}