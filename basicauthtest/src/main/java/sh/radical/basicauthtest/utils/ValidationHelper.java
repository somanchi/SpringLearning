package sh.radical.basicauthtest.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class ValidationHelper {

	Map<String, Map<String, List<String>>> allowedFiltersForField = new HashMap<>();

	Map<String, Set<String>> allowedSort = new HashMap<>();

	public ValidationHelper() {
		// adding sorts to set
		allowedSort.put("car", Set.of(""));
		// adding allowed sorts to the map
		allowedFiltersForField.put("car", Map.of());
	}
}
