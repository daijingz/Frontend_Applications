import unittest
import Approximation_Graph


class MyTestCase(unittest.TestCase):
    def test_FindVertexCover(self):
        G1 = Approximation_Graph.Approximation_Graph()
        G1.addEdge(0, 1)
        G1.addEdge(1, 2)
        G1.addEdge(2, 3)
        self.assertEqual(G1.FindVertexCover(), [0, 2])

        G2 = Approximation_Graph.Approximation_Graph()
        G2.addEdge(0, 1)
        G2.addEdge(1, 2)
        G2.addEdge(2, 3)
        G2.addEdge(3, 4)
        G2.addEdge(4, 0)
        self.assertEqual(G2.FindVertexCover(), [0, 2])

        G3 = Approximation_Graph.Approximation_Graph()
        G3.addEdge(0, 1)
        G3.addEdge(2, 0)
        G3.addEdge(2, 1)
        G3.addEdge(1, 3)
        G3.addEdge(1, 4)
        G3.addEdge(4, 3)
        self.assertEqual(G3.FindVertexCover(), [0, 3])