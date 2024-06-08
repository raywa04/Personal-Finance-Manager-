import React, { useState, useEffect } from 'react';
import BudgetService from '../services/BudgetService';

function Budgets({ userId }) {
    const [budgets, setBudgets] = useState([]);

    useEffect(() => {
        BudgetService.getBudgetsByUserId(userId).then((response) => {
            setBudgets(response.data);
        });
    }, [userId]);

    return (
        <div>
            <h2>Budgets</h2>
            <ul>
                {budgets.map((budget) => (
                    <li key={budget.id}>
                        {budget.category}: ${budget.limit}
                    </li>
                ))}
            </ul>
        </div>
    );
}

export default Budgets;
