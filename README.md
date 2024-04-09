### Adding Role API:
![Snipaste_2024-04-09_14-39-48](https://github.com/Liu-Chen-CS/AdminPanel/assets/158779475/d97e8e11-c472-40dc-ae2b-361245ee022a)

1. **Frontend Interaction**: The user interacts with the frontend interface, by clicking a "Submit" button to add a new role.

2. **Data Submission**: Upon clicking "Submit", the frontend sends a JSON payload containing role information such as role name, ID to the backend server.

3. **Database Persistence**: the service layer interacts with the database through the repository. The role information is then saved into the database, ensuring data integrity and consistency.
