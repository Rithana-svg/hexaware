// MainModule.java
package mainmod;

import dao.IPolicyService;
import dao.InsuranceServiceImpl;
import entity.Policy;
import myexceptions.PolicyNotFoundException;
import java.util.Collection;

public class MainModule {
    public static void main(String[] args) {
        IPolicyService policyService = new InsuranceServiceImpl();

        try {
            // Create a new policy
            Policy newPolicy = new Policy();
            // Set policy details
            boolean created = policyService.createPolicy(newPolicy);
            System.out.println("Policy created: " + created);

            // Get policy by ID
            try {
                Policy policy = policyService.getPolicy(1);
                System.out.println("Retrieved policy: " + policy);
            } catch (PolicyNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            }

            // Get all policies
            Collection<Policy> policies = policyService.getAllPolicies();
            System.out.println("All policies: " + policies);

            // Update policy
            try {
                Policy updatePolicy = new Policy();
                // Set updated policy details
                boolean updated = policyService.updatePolicy(updatePolicy);
                System.out.println("Policy updated: " + updated);
            } catch (PolicyNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            }

            // Delete policy
            try {
                boolean deleted = policyService.deletePolicy(1);
                System.out.println("Policy deleted: " + deleted);
            } catch (PolicyNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
