import unittest
import Sort


class MyTestCase(unittest.TestCase):
    def test_checkAvailable(self):
        tst1 = [1, 2, 3, 4, 5, 6, 4]
        self.assertEqual(False, Sort.checkAvailable(tst1))

        tst2 = [0, 2, 3, 4, 5, 6, 1]
        self.assertEqual(False, Sort.checkAvailable(tst2))

        tst3 = [1, 2, 3, 4, 5, 6]
        self.assertEqual(True, Sort.checkAvailable(tst3))

        tst4 = [-10, -8, -6, -7]
        self.assertEqual(True, Sort.checkAvailable(tst4))

        tst5 = [1.0, 2.0, 1.5, 3, 5, 6, 4]
        self.assertEqual(True, Sort.checkAvailable(tst5))

    def test_SelectionSort(self):
        tst6 = [1, 2, 3, 7, 5, 6, 4]
        true_tst6 = [1, 2, 3, 4, 5, 6, 7]
        self.assertEqual(true_tst6, Sort.SelectionSort(tst6))

        tst7 = [-1, -2, -3, -7, -5, -6, -4]
        true_tst7 = [-7, -6, -5, -4, -3, -2, -1]
        self.assertEqual(true_tst7, Sort.SelectionSort(tst7))

        tst8 = [10, -2, 3, -7, 5, 6, -4]
        true_tst8 = [-7, -4, -2, 3, 5, 6, 10]
        self.assertEqual(true_tst8, Sort.SelectionSort(tst8))

        tst9 = [5.0, 4.0, 3.0, 2.0, 1.0]
        true_tst9 = [1.0, 2.0, 3.0, 4.0, 5.0]
        self.assertEqual(true_tst9, Sort.SelectionSort(tst9))

        tst10 = []
        true_tst10 = []
        self.assertEqual(true_tst10, Sort.SelectionSort(tst10))

    def test_InsertionSort(self):
        tst11 = [1, 2, 3, 7, 5, 6, 4]
        true_tst11 = [1, 2, 3, 4, 5, 6, 7]
        self.assertEqual(true_tst11, Sort.InsertionSort(tst11))

        tst12 = [-1, -2, -3, -7, -5, -6, -4]
        true_tst12 = [-7, -6, -5, -4, -3, -2, -1]
        self.assertEqual(true_tst12, Sort.InsertionSort(tst12))

        tst13 = [10, -2, 3, -7, 5, 6, -4]
        true_tst13 = [-7, -4, -2, 3, 5, 6, 10]
        self.assertEqual(true_tst13, Sort.InsertionSort(tst13))

        tst14 = [5.0, 4.0, 3.0, 2.0, 1.0]
        true_tst14 = [1.0, 2.0, 3.0, 4.0, 5.0]
        self.assertEqual(true_tst14, Sort.InsertionSort(tst14))

        tst15 = []
        true_tst15 = []
        self.assertEqual(true_tst15, Sort.InsertionSort(tst15))


if __name__ == '__main__':
    unittest.main()
