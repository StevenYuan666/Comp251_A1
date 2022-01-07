# Hash Table Implementation
Building a Hash Table We want to compare the performance of hash tables implemented using chaining and open addressing. In this assignment, we will consider hash tables implemented using the multiplication and linear probing methods. We will (respectively) call the hash functions h and g and describe them below. Note that we are using the hash function h to define g.

![image](https://user-images.githubusercontent.com/68981504/148497840-282420c8-054c-4633-ab26-505f7fd36fa9.png)

In the formula above, r and w are two integers such that w > r, and A is a random number such that 2w−1 < A < 2w. In addition, let n be the number of keys inserted, and m the num- ber of slots in the hash tables. Here, we set m = 2r and r = ⌈w/2⌉. The load factor α is equal to m/n .

We want to estimate the number of collisions when inserting keys with respect to keys and the choice of values for A.
