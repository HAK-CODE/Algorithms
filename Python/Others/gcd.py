
def gcd(p, q):
    """
    :param p:
    :param q:
    :return: greatest comman factor of two provided numbers p and q.
    """
    if q == 0:
        return p
    r = p % q
    return gcd(q, r)


print(gcd(12, 8))
print(gcd(36, 18))
