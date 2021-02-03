{% extends "base.html" %}
{% block content %}

<h2>Match/h2>

{% for match in matches %}

<section>
    <p>{{ match.name }}</p>
    <a href="/matches/{{ match.id }}/edit"></a>
    <form action="/match/{{ match.id }}/delete" method="POST">
        <input type="submit" value="Delete">
    </form>
</section>

{% endfor %}
{% endblock %}