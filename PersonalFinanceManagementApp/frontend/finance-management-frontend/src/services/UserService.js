import axios from 'axios';

const API_URL = 'http://localhost:8080/api/users';

class UserService {
    register(user) {
        return axios.post(API_URL, user);
    }

    login(user) {
        return axios.post(`${API_URL}/login`, user);
    }
}

export default new UserService();
