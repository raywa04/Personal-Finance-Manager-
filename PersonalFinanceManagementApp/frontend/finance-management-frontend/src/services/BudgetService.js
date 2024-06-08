import axios from 'axios';

const API_URL = 'http://localhost:8080/api/budgets';

class BudgetService {
    createBudget(budget) {
        return axios.post(API_URL, budget);
    }

    getBudgetsByUserId(userId) {
        return axios.get(`${API_URL}/user/${userId}`);
    }
}

export default new BudgetService();
