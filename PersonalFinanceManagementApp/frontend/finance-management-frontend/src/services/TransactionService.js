import axios from 'axios';

const API_URL = 'http://localhost:8080/api/transactions';

class TransactionService {
    createTransaction(transaction) {
        return axios.post(API_URL, transaction);
    }

    getTransactionsByUserId(userId) {
        return axios.get(`${API_URL}/user/${userId}`);
    }
}

export default new TransactionService();
