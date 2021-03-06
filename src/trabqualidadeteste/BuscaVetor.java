package trabqualidadeteste;

public class BuscaVetor {

    public static void busca(SearchType type, int[] itens, int size, int key, ResultType result, boolean ascending) {
        int aux = 0;
        if (ascending) {

            for (int indice = 0; indice < size; indice++) {

                if (type.equals(SearchType.Equals)) {

                    if (key == itens[indice]) {
                        result.ReturnType(ResultType.SearchResult.FoundExact, indice, itens[indice]);
                        break;
                    } else {
                        result.ReturnType(ResultType.SearchResult.NotFound, null, null);
                    }
                }
                if (type.equals(SearchType.GreaterThan)) {

                    if (itens[indice] > key) {
                        result.ReturnType(ResultType.SearchResult.FoundGreater, indice, itens[indice]);
                        break;
                    } else {
                        result.ReturnType(ResultType.SearchResult.NotFound, null, null);

                    }

                }
                if (type.equals(SearchType.GreaterThanEquals)) {

                    if (key == itens[indice]) {
                        result.ReturnType(ResultType.SearchResult.FoundExact, indice, itens[indice]);
                        break;
                    } else if (itens[indice] > key) {
                        result.ReturnType(ResultType.SearchResult.FoundGreater, indice, itens[indice]);
                        break;
                    } else {
                        result.ReturnType(ResultType.SearchResult.NotFound, null, null);
                    }

                }
                if (type.equals(SearchType.LessThan)) {

                    if (itens[indice] < key) {
                        aux = itens[indice + 1];
                        if (aux >= key) {
                            result.ReturnType(ResultType.SearchResult.FoundLess, indice, itens[indice]);
                            break;
                        }
                    } else {
                        result.ReturnType(ResultType.SearchResult.NotFound, null, null);
                    }

                }
                if (type.equals(SearchType.LessThanEquals)) {

                    if (key == itens[indice]) {
                        result.ReturnType(ResultType.SearchResult.FoundExact, indice, itens[indice]);
                        break;
                    } else if (itens[indice] < key) {
                        aux = itens[indice + 1];
                        if (aux > key) {
                            result.ReturnType(ResultType.SearchResult.FoundLess, indice, itens[indice]);
                            break;
                        }
                    } else {
                        result.ReturnType(ResultType.SearchResult.NotFound, null, null);
                    }

                }

            }

        } else {

            for (int indice = size - 1; indice >= 0; indice--) {

                if (type.equals(SearchType.Equals)) {
                    if (key == itens[indice]) {
                        result.ReturnType(ResultType.SearchResult.FoundExact, indice, itens[indice]);
                        break;
                    } else {
                        result.ReturnType(ResultType.SearchResult.NotFound, null, null);
                    }
                }
                if (type.equals(SearchType.GreaterThan)) {

                    if (itens[indice] > key) {
                        aux = itens[indice - 1];
                        if (aux <= key) {
                            result.ReturnType(ResultType.SearchResult.FoundGreater, indice, itens[indice]);
                            break;
                        }
                    } else {
                        result.ReturnType(ResultType.SearchResult.NotFound, null, null);

                    }

                }
                if (type.equals(SearchType.GreaterThanEquals)) {

                    if (key == itens[indice]) {
                        result.ReturnType(ResultType.SearchResult.FoundExact, indice, itens[indice]);
                        break;
                    } else if (itens[indice] > key) {
                        aux = itens[indice - 1];
                        if (aux < key) {
                            result.ReturnType(ResultType.SearchResult.FoundGreater, indice, itens[indice]);
                            break;
                        }
                    } else {
                        result.ReturnType(ResultType.SearchResult.NotFound, null, null);
                    }

                }
                if (type.equals(SearchType.LessThan)) {

                    if (itens[indice] < key) {
                        result.ReturnType(ResultType.SearchResult.FoundLess, indice, itens[indice]);
                        break;
                    } else {
                        result.ReturnType(ResultType.SearchResult.NotFound, null, null);
                    }

                }
                if (type.equals(SearchType.LessThanEquals)) {

                    if (key == itens[indice]) {
                        result.ReturnType(ResultType.SearchResult.FoundExact, indice, itens[indice]);
                        break;
                    } else if (itens[indice] < key) {
                        result.ReturnType(ResultType.SearchResult.FoundLess, indice, itens[indice]);
                        break;
                    } else {
                        result.ReturnType(ResultType.SearchResult.NotFound, null, null);
                    }

                }

            }

        }

    }
}
