# �� �ʰ�

[���� ��ũ](https://school.programmers.co.kr/learn/courses/30/lessons/42626)

[���� ��� ��ũ](https://jinwonyoon.notion.site/3a181af67689451b8137d96dd50f1a7e)

---

### ���� ����

�ſ� ���� �����ϴ� Leo�� ��� ������ ���ں� ������ K �̻����� ����� �ͽ��ϴ�.

��� ������ ���ں� ������ K �̻����� ����� ���� Leo�� ���ں� ������ ���� ���� �� ���� ������ �Ʒ��� ���� Ư���� ������� ���� ���ο� ������ ����ϴ�.

</br>

```
���� ������ ���ں� ���� = ���� ���� ���� ������ ���ں� ���� + (�� ��°�� ���� ���� ������ ���ں� ���� * 2)
```

</br>

Leo�� ��� ������ ���ں� ������ K �̻��� �� ������ �ݺ��Ͽ� �����ϴ�.

Leo�� ���� ������ ���ں� ������ ���� �迭 scoville�� ���ϴ� ���ں� ���� K�� �־��� ��, ��� ������ ���ں� ������ K �̻����� ����� ���� ����� �ϴ� �ּ� Ƚ���� return �ϵ��� solution �Լ��� �ۼ����ּ���.

</br>

### ���� ����

- scoville�� ���̴� 2 �̻� 1,000,000 �����Դϴ�.
- K�� 0 �̻� 1,000,000,000 �����Դϴ�.
- scoville�� ���Ҵ� ���� 0 �̻� 1,000,000 �����Դϴ�.
- ��� ������ ���ں� ������ K �̻����� ���� �� ���� ��쿡�� -1�� return �մϴ�.

</br>

### ����� ��

|scoville|K|return|
|:-----:|:----:|:----:|
|[1, 2, 3, 9, 10, 12]|7|2|

</br>

### ����� �� ����

1. ���ں� ������ 1�� ���İ� 2�� ������ ������ ������ ���ں� ������ �Ʒ��� ���� �˴ϴ�.

    ���ο� ������ ���ں� ���� = 1 + (2 * 2) = 5, ���� ������ ���ں� ���� = [5, 3, 9, 10, 12]

2. ���ں� ������ 3�� ���İ� 5�� ������ ������ ������ ���ں� ������ �Ʒ��� ���� �˴ϴ�.

    ���ο� ������ ���ں� ���� = 3 + (5 * 2) = 13, ���� ������ ���ں� ���� = [13, 9, 10, 12]

��� ������ ���ں� ������ 7 �̻��� �Ǿ��� �̶� ���� Ƚ���� 2ȸ�Դϴ�.